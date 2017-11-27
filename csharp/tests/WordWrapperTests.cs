using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace WordWrapper.Tests
{
	[TestClass]
	public class WordWrapperTests
	{
		[TestMethod]
		public void wrapWordsTest()
		{
			string sourceString = null;
			int maximumCharactersPerLine = 0;

			List<string> expected = null;
			List<string> actual = WordWrapper.wrapWords(sourceString, maximumCharactersPerLine);

			CollectionAssert.AreEqual(expected, actual);
		}
	}
}
